#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define Tam_Max 100000


/*Maycon Wellington RA:140216*/
/* Deixei os links que usei, no pdf */

void merge(int vetor[], int inicio, int fim, int r) //
{
    int aux[Tam_Max];
    int i = inicio, j = fim+1, k = 0;
    while (i <= fim && j <= r)
        if (vetor[i] <= vetor[j])
            aux[k++] = vetor[i++];
        else aux[k++] = vetor[j++];

    while (i <= fim)  aux[k++] = vetor[i++];
    while (j <= r)  aux[k++] = vetor[j++];
    for (i = inicio, k = 0; i <= r; i++, k++)  vetor[i] = aux[k];
}

void Merge_sort(int vetor[], int l, int r)
{
    int m = (l + r) / 2;
    if (l < r)
    {

        Merge_sort(vetor, l, m);
        Merge_sort(vetor, m + 1, r);
        merge(vetor, l, m, r);

    }

}


void quick_sort(int vetor[], int inicio, int tam)
{
    int i, j, pivo, aux;

    i = inicio;
    j = tam;
    pivo = vetor[(inicio + tam) / 2];

    while(i <= j)
    {

        while(vetor[i] < pivo && i < tam)
        {
            i++;
        }
        while(vetor[j] > pivo && j > inicio)
        {
            j--;
        }
        if(i <= j)
        {
            aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
            i++;
            j--;
        }

    }

    if(j > inicio)
    {
        quick_sort(vetor, inicio, j);
    }
    if(i < tam)
    {
        quick_sort(vetor, i, tam);
    }


}



int main(void)
{

    int i, *vetor_merge, *vetor_quick, tam=100000;


    clock_t tempo_quick, tempo_merge;

    vetor_merge=(int*)malloc(tam*sizeof(int));
    vetor_quick=(int*)malloc(tam*sizeof(int));

    for(i=0; i<tam; i++)
    {
        vetor_merge[i]=rand()%tam;

    }
    vetor_quick=vetor_merge;



    /*printf("Vetor antes das funcoes! \n");

    for(i = 0; i < tam; i++)
    {
        printf("%d ", vetor_merge[i]);
    }*/
    printf("\n");
    printf("\n");

    tempo_quick=clock();

    quick_sort(vetor_quick, 0, tam-1);



    /* printf("Ordenacao QuickSort: ");

     for(i = 0; i < tam; i++){
             printf("%d ", vetor_quick[i]);
     }*/
    printf("\n");
    printf("Tempo da funcao QuickSort: %f\n",((float)clock()-tempo_quick)/CLOCKS_PER_SEC);

    printf("\n");
    tempo_merge=clock();

    Merge_sort(vetor_merge, 0,tam+1) ;



    /*printf("Vetor ordenado Mergesort: ");

    for(i = 0; i < tam; i++)
    {
        printf("%d ", vetor_merge[i]);
    }*/
    printf("\n");
    printf("Tempo da funcao MergeSort: %f\n", ((float)clock()-tempo_merge)/CLOCKS_PER_SEC);
    printf("\n");

}
