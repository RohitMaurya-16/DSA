class Solution {

    public class TrieNode
    {
        TrieNode children[]=new TrieNode[26];
        String word;

    }

    public TrieNode root;
    List<String> result;

    public List<String> findWords(char[][] board, String[] words) {

        root= new TrieNode();
        result=new ArrayList<>();

        for(String w: words)
        {
            insert(w);
        }

        
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                check(board, i,j,root);
            }
        }

        return result;
        
    }

    private void insert(String word)
    {
           TrieNode node=root;

           for(char ch:word.toCharArray())
           {
            int idx=ch-'a';

            if(node.children[idx]==null)
            {
                node.children[idx]=new TrieNode();
            }

            node=node.children[idx];
           }

           node.word=word;
    }


    private void check(char[][] bd, int i, int j, TrieNode node)
    {

        if (i < 0 || j < 0 ||
            i >= bd.length || j >= bd[0].length ||
            bd[i][j] == '#') {
            return;
        }


        char ch=bd[i][j];
        
        int idx=ch-'a';

        TrieNode nd=node.children[idx];

        if(nd==null)
        {
            return;
        }

        if(nd.word!=null)
        {
            result.add(nd.word);
            nd.word=null;
        }

        bd[i][j]='#';

        check(bd,i+1,j,nd);
        check(bd,i-1,j,nd);
        check(bd,i,j+1,nd);
        check(bd,i,j-1,nd);

        bd[i][j]=ch;
    }
}