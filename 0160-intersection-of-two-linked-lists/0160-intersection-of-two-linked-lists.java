/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         HashSet<ListNode> list= new HashSet<>();

//         while(headA!=null)
//         {
//             list.add(headA);
//             headA=headA.next;
//         }

//         while(headB!=null)
//         {
//             if(list.contains(headB))
//             {
//                 return headB;
//             }

//             headB=headB.next;
//         }

//         return null;
//     }
// }

ListNode nodeA=headA;
ListNode nodeB=headB;

int lenA=0;
int lenB=0;

while(nodeA!=null)
{
    lenA++;
    nodeA=nodeA.next;
}

while(nodeB!=null)
{
    lenB++;
    nodeB=nodeB.next;
}

nodeA=headA;
nodeB=headB;

if(lenA>lenB)
{
    int diff=lenA-lenB;
    while(diff>0)
    {
        nodeA=nodeA.next;
        diff--;
    }
}
else
{
    int diff=lenB-lenA;
    while(diff>0)
    {
        nodeB=nodeB.next;
        diff--;
    }
}

ListNode a=nodeA;
ListNode b=nodeB;

while(a!=null && b!=null)
{
    if(a==b)return a;
    a=a.next;
    b=b.next;
}

return null;
    }
}



