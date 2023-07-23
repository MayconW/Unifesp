
#include <stdio.h>
#include <stdlib.h>


void quicksort(int v[], int left, int right,int k);

void show(int v[], int size)
{
    int i;
    for(i = 0; i < size; i++)
        printf("%d ",v[i]);
    printf("\n");
}

void swap(int* a, int* b)
{
    int aux = *a;
    *a = *b;
    *b = aux;
}

int Particao (int v[], int left, int right)
{
    int pivo = v[right];
    int i = (left - 1);
    int j;
    for (j = left; j <= right - 1; j++)
    {
        if (v[j] < pivo)
        {
            i++;
            swap(&v[i], &v[j]);
        }
    }
    swap(&v[i + 1], &v[right]);
    return (i + 1);
}

void quicksort(int v[], int left, int right, int k)
{
    int pivo;
    if(k>0 && k<=right-left+1)
    {
        pivo = Particao(v, left, right);
        if(pivo-left <= k-1)
        {
            quicksort(v, pivo + 1, right, k-pivo+left-1);
        }
        else
        {
            quicksort(v, left, pivo - 1, k);
        }
    }
}

int main(void)
{
    int N,K, left, right;
    int *vetor;
    int i=0;

    printf("Digite a posição que queremos descobrir: ");
    scanf("%d", &K);
    printf("Digite o valor do tamanho do vetor:");
    scanf("%d", &N);

    vetor=(int*)malloc(N*sizeof(int));

    for(i=0; i<N; i++)
    {
        scanf("%d", &vetor[i]);
    }

    quicksort(vetor, 0, N-1,K);

    printf("\n---Vetor ordenado pelo método QuickSort---\n");
    printf("%do menor elemento eh o %d\n",K,vetor[K-1]);
    show(vetor,N);
    free(vetor);
    return 0;
}