// Fibonacci.cpp : Defines the entry point for the console application.
//
#include "stdafx.h"
#include <iostream>
using namespace std;

void shortF()
{
	bool parar = false;
	int it = 1;
	short fi = 0;
	short a = 0;
	short s = 1;

	while (!parar)
	{
		fi = a + s;

		if (fi > 0)
		{
			a = s;
			s = fi;
			//cout << fi << "\n";
			it++;
		}
		else
		{
			parar = true;
		}
	}

	cout << "Numero: " << it << " Calculado: " << fi << " " << " Anterior: " << a << " Siguiente:" << s;
}

void intF()
{
	bool parar = false;
	int it = 1;
	int fi = 0;
	int a = 0;
	int s = 1;

	while (!parar)
	{
		fi = a + s;

		if (fi > 0)
		{
			a = s;
			s = fi;
			//cout << fi << "\n";
			it++;
		}
		else
		{
			parar = true;
		}
	}

	cout << "Numero: " << it << " Calculado: " << fi << " " << " Anterior: " << a << " Siguiente:" << s;
}

void longF()
{
	bool parar = false;
	int it = 1;
	long fi = 0;
	long a = 0;
	long s = 1;

	while (!parar)
	{
		fi = a + s;

		if (fi > 0)
		{
			a = s;
			s = fi;
			//cout << fi << "\n";
			it++;
		}
		else
		{
			parar = true;
		}
	}

	cout << "Numero: " << it << " Calculado: " << fi << " " << " Anterior: " << a << " Siguiente:" << s;
}

void longlongF()
{
	bool parar = false;
	int it = 1;
	long long fi = 0;
	long long a = 0;
	long long s = 1;

	while (!parar)
	{
		fi = a + s;

		if (fi > 0)
		{
			a = s;
			s = fi;
			//cout << fi << "\n";
			it++;
		}
		else
		{
			parar = true;
		}
	}

	cout << "Numero: " << it << " Calculado: " << fi << " " << " Anterior: " << a << " Siguiente:" << s;
}


int main()
{
	cout << "Fibonacci Series: ";

	cout << "\n";
	intF();
	cout << "\n";
	longF();
	cout << "\n";
	longlongF();

	int a;
	cin >> a;
	return 0;
}
