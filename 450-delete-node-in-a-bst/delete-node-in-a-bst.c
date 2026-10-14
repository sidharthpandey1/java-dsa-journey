/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
struct TreeNode* deleteNode(struct TreeNode* root, int key) {
    if(root==NULL) return NULL;
    if(key<root->val){
        root->left=deleteNode(root->left,key);
    }
    else if(key>root->val){
        root->right=deleteNode(root->right,key);
    }
    else{
        if(root->left==NULL && root->right==NULL){
            free(root);
            return NULL;
        }
        else if(root->left!=NULL && root->right==NULL){
            //root->val=root->left->val;
            //root->left=deleteNode(root->left,root->val);
            struct TreeNode* temp=root->left;
            free(root);
            return temp;
        }
        else if(root->right!=NULL && root->left==NULL){
            //root->val=root->right->val;
            //root->right=deleteNode(root->right,root->val);
            struct TreeNode* temp=root->right;
            free(root);
            return temp;
        }
        else{
            struct TreeNode* temp=root->right;
            while(temp->left!=NULL){
                temp=temp->left;
            }
            root->val=temp->val;
            root->right=deleteNode(root->right,root->val);
        }
        
    }
    return root;
    
}