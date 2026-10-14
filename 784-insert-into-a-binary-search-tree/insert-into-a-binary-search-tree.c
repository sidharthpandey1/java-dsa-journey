/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
 struct TreeNode* createnode(int key){
    struct TreeNode* p;
    p= (struct TreeNode*) malloc(sizeof(struct TreeNode));
    p->left=NULL;
    p->right=NULL;
    p->val=key;
    return p;
}
struct TreeNode* insertIntoBST(struct TreeNode* root, int key) {
    if(root==NULL) return createnode(key);
    else if(key<root->val){
        root->left=insertIntoBST(root->left,key);
    }
    else{
        root->right=insertIntoBST(root->right,key);
    }
    return root;
    
}
