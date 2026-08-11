// Last updated: 8/11/2026, 2:20:31 PM
1class Solution {
2    public String smallestFromLeaf(TreeNode root) {
3        StringBuilder smallest = new StringBuilder();
4        dfs(root, new StringBuilder(), smallest);
5        return smallest.toString();
6    }
7    
8    private void dfs(TreeNode node, StringBuilder path, StringBuilder smallest) {
9        if (node == null) return;
10        
11        // Append current node's character to the path
12        path.append((char)('a' + node.val));
13        
14        // If it's a leaf node, compare and update smallest
15        if (node.left == null && node.right == null) {
16            String currentString = path.reverse().toString();
17            if (smallest.length() == 0 || currentString.compareTo(smallest.toString()) < 0) {
18                smallest.setLength(0);
19                smallest.append(currentString);
20            }
21            path.reverse(); // backtrack by reversing again
22        }
23        
24        // Recursively traverse left and right subtrees
25        dfs(node.left, path, smallest);
26        dfs(node.right, path, smallest);
27        
28        // Backtrack: remove the current node's character from the path
29        path.setLength(path.length() - 1);
30    }
31}