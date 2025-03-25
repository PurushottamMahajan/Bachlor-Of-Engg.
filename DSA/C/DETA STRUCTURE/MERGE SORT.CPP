// C++ implementation of the
// merge sort algorithm
#include <iostream>
using namespace std;
// This function merges two subarrays of arr[]
// Left subarray: arr[leftIndex..middleIndex]
// Right subarray: arr[middleIndex+1..rightIndex]
void merge(int arr[], int leftIndex, int middleIndex, int rightIndex)
{
int leftSubarraySize = middleIndex - leftIndex + 1;
int rightSubarraySize = rightIndex - middleIndex;
// Create temporary arrays
int L[leftSubarraySize], R[rightSubarraySize];
// Copying data to temporary arrays L[] and R[]
for (int i = 0; i < leftSubarraySize; i++)
L[i] = arr[leftIndex + i];
for (int j = 0; j < rightSubarraySize; j++)
R[j] = arr[middleIndex + 1 + j];
// Merge the temporary arrays back into arr[leftIndex..rightIndex]
// Initial index of Left subarray
int i = 0;
// Initial index of Right subarray
int j = 0;
// Initial index of merged subarray
int k = leftIndex;
while (i < leftSubarraySize && j < rightSubarraySize)
{
if (L[i] <= R[j])
{
arr[k] = L[i];
i++;
}
else
{
arr[k] = R[j];
j++;
}
k++;
}
// If there're some remaining elements in L[]
// Copy to arr[]
while (i < leftSubarraySize)
{
arr[k] = L[i];
i++;
k++;
}
// If there're some remaining elements in R[]
// Copy to arr[]
while (j < rightSubarraySize)
{
arr[k] = R[j];
j++;
k++;
}
}
void mergeSort(int arr[], int leftIndex, int rightIndex)
{
if(leftIndex >= rightIndex)
{
return;
}
int middleIndex = leftIndex + (rightIndex - leftIndex)/2;
mergeSort(arr, leftIndex, middleIndex);
mergeSort(arr, middleIndex+1, rightIndex);
merge(arr, leftIndex, middleIndex, rightIndex);
}

// Function to print the elements
// of the array
void printArray(int arr[], int size)
{
for (int i = 0; i < size; i++)
{
cout << arr[i] << " ";
}
cout << endl;
}
// Driver code
int main()
{
int arr[] = { 16, 12, 15, 13, 19, 17, 11, 18 };
int size = sizeof(arr) / sizeof(arr[0]);
cout << "Unsorted array:" << endl;
printArray(arr, size);
mergeSort(arr, 0, size - 1);
cout << "Sorted array:" << endl;
printArray(arr, size);
return 0;
}

