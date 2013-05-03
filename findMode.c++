#include <iostream>
#include <cstdlib>
#include <ctime>

using namespace std;

int findMode(int *, int);

int main() 
{
  srand(time(0));
	int size = rand()%100 + 1;
	int *a = new int[size];
	for (int i = 0; i < size; ++i) 
	{
		if (i%10 == 0) {
			cout << endl;
		}
		*(a+i) = rand()%20 + 1;
		cout << *(a+i) << "\t";
	}
	cout << endl;
	int modeValue = findMode(a, size);
	cout << modeValue << " occurs most often.\n";
	delete[] a;
	a = NULL;
	system("pause");
	return 0;
}

int findMode(int *a, int size)
{
	int *b = new int[20];
	for (int i = 0; i < 20; ++i) {
		*(b+i) = 0;
	}
	for (int i = 0; i < size; ++i) 
	{
		*(b + *(a +i)) +=1;
	}
	int max = *b;
	int index = 0;
	for (int i = 0; i < 20; ++i)
	{
		if (*(b+i) > max)
		{
			max = *(b+i);
			index = i;
		}
	}
	delete[] b;
	b = NULL;

	return index;
}

