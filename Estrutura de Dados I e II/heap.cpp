
#include <iostream>
#include <string>
#include<string.h>
using namespace std;
 

int x = -1;
 

string Vet_Aux[1000];
 

void heapForm(string k)
{
    x++;
 
    Vet_Aux[x] = k;
 
    int aux = x;
 
    string tmp;
 
    int index = x / 2;
 
  
    while (index >= 0) {
 
      
        if (Vet_Aux[index] > Vet_Aux[aux]) {
 
         
            tmp = Vet_Aux[index];
            Vet_Aux[index] = Vet_Aux[aux];
            Vet_Aux[aux] = tmp;
            aux = index;
 
           
            index = index / 2;
        }
        else {
            break;
        }
    }
}
 

void Max_Heapfy()
{
    int left1, right1;
 
    while (x >= 0) {
        string k;
        k = Vet_Aux[0];
 
        cout << k << " ";
 
        Vet_Aux[0] = Vet_Aux[x];
 
        x = x - 1;
 
        string tmp;
 
        int index = 0;
 
        int length = x;
 
        left1 = 1;
 
        right1 = left1 + 1;
 
        while (left1 <= length) {
 
        
            if (Vet_Aux[index] <= Vet_Aux[left1]
                && Vet_Aux[index] <= Vet_Aux[right1]) {
                break;
            }
 
       
            else {
 
  
                if (Vet_Aux[left1] < Vet_Aux[right1]) {
                    tmp = Vet_Aux[index];
                    Vet_Aux[index] = Vet_Aux[left1];
                    Vet_Aux[left1] = tmp;
                    index = left1;
                }
 
                else {
                    tmp = Vet_Aux[index];
                    Vet_Aux[index] = Vet_Aux[right1];
                    Vet_Aux[right1] = tmp;
                    index = right1;
                }
            }
 
            
            left1 = 2 * left1;
            right1 = left1 + 1;
        }
    }
}
 

void build_heap(string k[], int n, int *indices)
{
  int ind;
cout << "build_heap:"; 

    for (int i = 0; i < n; i++) {
    ind=indices[i];
    cout << " " << k[i]; 
        heapForm(k[i]);
    }
cout << "\n" ;
cout << "palavras: ";
 
  
    Max_Heapfy();
}
 
 int verifica(string vetor, int j){
int i;

for(i=0; i<vetor.length(); i++){
char ch=vetor[i];
if(islower(ch)==0){
return 0;
}
}


return 1;
 }

int main()
{
  int i, qtd, ind, tam;
  cin >> tam;
string arr[tam];
  for(i=0;i<tam; i++){
 cin >> arr[i];
  }
 
  cin >> qtd;
 
string aux[qtd];
 
  int indices[3];
  for(i=0; i< qtd; i++){
cin >> indices[i];
  }
  for(i=0;i<tam; i++){

 if(verifica(arr[i], i)==0){
   cout << "a palavra " << arr[i] << " eh invalida\n" ;
   return 0;
 }
  }
 
  for(i=0; i<qtd; i++){
    ind=indices[i];
    aux[i]=arr[ind];
  }
 
    int n = sizeof(aux) / sizeof(aux[0]);
 
    build_heap(aux, n, indices);
}