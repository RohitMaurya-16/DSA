class TrieNode{
    TrieNode children[]= new TrieNode[26];
    boolean isEnd=false;
}

class WordDictionary {
    
    private TrieNode root;
    public WordDictionary() {

        root= new TrieNode();
        
    }
    
    public void addWord(String word) {

        TrieNode current=root;

        for(char ch:word.toCharArray())
        {
            int idx=ch-'a';

            if(current.children[idx]==null)
            {
                current.children[idx]=new TrieNode();
            }

            current=current.children[idx];
        }

        current.isEnd=true;
  
    }

    
    public boolean search(String word) {
        return dfs(root,word,0);
    }

    private boolean dfs(TrieNode root, String word, int idx)
    {
        if(idx==word.length())
        {
            return root.isEnd;
        }

        char ch=word.charAt(idx);

        if(ch=='.')
        {
            for(TrieNode  child : root.children)
            {
                if(child!=null && dfs(child, word,idx+1))
                {
                    return true;
                }
            }

            return false;
        }
       
       int index=ch-'a';

       TrieNode node=root.children[index];

       if(node==null)
       {
        return false;
       }

       return dfs(node, word, idx+1);

    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */