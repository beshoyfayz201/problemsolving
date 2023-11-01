import 'package:dart_application_1/dart_application_1.dart'
    as dart_application_1;

class TreeNode {
  int val;
  TreeNode? left;
  TreeNode? right;
  TreeNode([this.val = 0, this.left, this.right]);
}

class Solution {
  List<int> inorderTraversal(TreeNode? root) {
    List<int> result = [];
    if (root != null) {
      if (root.left != null) {
        result.addAll(inorderTraversal(root.left));
      }
      result.add(root.val);
      if (root.right != null) {
        result.addAll(inorderTraversal(root.right));
      }
    }
    return result;
  }
}

void main(List<String> arguments) {}
