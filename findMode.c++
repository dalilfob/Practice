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

// This one gets heap corruption error. Not sure why
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

// working method. Better space complexity, worse time complexity than above method. 
int findMode(int *a, int size)
{
	int max = 0;
	int counter = 0;
	int index = 0;
	for (int i = 0; i < size; ++i) 
	{
		for (int j = 0; j < size; j++)
		{
			if (*(a+j) == i) {
				counter++;
			}
		}
		if (counter > max) {
			max = counter;
			counter = 0;
			index = i;
		} else {
			counter = 0;
		}
	}
	return index;
}

