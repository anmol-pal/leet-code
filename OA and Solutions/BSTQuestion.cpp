#include <bits/stdc++.h>
#include <fstream>
#include <iostream>
#include <sstream>
#include <string>
#include <vector>


#include <math.h>
/*
 * Complete the 'BSTdistance' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY values
 *  2. INTEGER nodeA
 *  3. INTEGER nodeB
 */
//https://www.chegg.com/homework-help/questions-and-answers/1-construct-binary-search-tree-order-integers-given-input-argument-vector-2-return-distanc-q100883302
struct Node{
    int data;
    Node* left;
    Node* right;
};
int heightA=-1, heightB=-1;
int height = 0;
void insertNode(Node* root, int val, bool trackHeight){
    if(root == NULL){
        root = new Node{val,nullptr,nullptr};
        if(trackHeight){
            if(heightA==-1){
                heightA = height;
            }else{
                heightB = height;
            }
        }
        return;
    }
    height++;
    if(root->data<val){
        insertNode(root->left, val, trackHeight);
    }else{
        insertNode(root->right, val, trackHeight);
    }
}
int BSTdistance(std::vector<int> values, int nodeA, int nodeB)
{   
    
    Node* root;
    root =  new Node{values[0],nullptr,nullptr};
    unsigned int vecSize=values.size();
    for(unsigned int i=0; i<vecSize; i++){
        if(values[i]==nodeA || values[i]==nodeB){
            insertNode(root, values[i],true);
        }else{
            insertNode(root, values[i],false);
        }
    }
    if(heightA==-1 || heightB==-1){
        return -1;
    }
    return abs(heightA-heightB);
}
int main()
{
    std::ofstream fout(std::getenv("OUTPUT_PATH"));

    std::string inputString;
    std::getline(std::cin, inputString);
    inputString.erase(std::remove(inputString.begin(), inputString.end(), ','), inputString.end());
    std::stringstream input(inputString);
    
    std::string vectorInputString;
    std::getline(input, vectorInputString, '{');
    std::getline(input, vectorInputString, '}');
    std::stringstream vectorInput(vectorInputString);
    
    int v;
    std::vector<int> values;
    while (vectorInput >> v)
        values.push_back(v);
    
    int nodeA;
    int nodeB;
    input >> nodeA;
    input >> nodeB;

    fout << BSTdistance(values, nodeA, nodeB);

    fout.close();

    return 0;
}