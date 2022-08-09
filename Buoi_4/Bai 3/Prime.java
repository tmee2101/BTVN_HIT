
public class Prime {
	public boolean isPrime(int n) {
		if (n < 2)
			return false;
		else if (n == 2 || n == 3)
			return true;
		else {
			for (int i = 2; i * i <= n; i++)
				if (n % i == 0)
					return false;
			return true;
		}
	}

	public boolean isPrime(long n) {
		if (n < 2)
			return false;
		else if (n == 2 || n == 3)
			return true;
		else {
			for (int i = 2; i * i <= n; i++)
				if (n % i == 0)
					return false;
			return true;
		}
	}

	public boolean isPrime(float n) {
		if ((long) n != n)
			return false;
		else {
			if (n < 2)
				return false;
			else if (n == 2 || n == 3)
				return true;
			else {
				for (int i = 2; i * i <= n; i++)
					if (n % i == 0)
						return false;
				return true;
			}
		}
	}

	public boolean isPrime(double n) {
		if ((long) n != n)
			return false;
		else {
			if (n < 2)
				return false;
			else if (n == 2 || n == 3)
				return true;
			else {
				for (int i = 2; i * i <= n; i++)
					if (n % i == 0)
						return false;
				return true;
			}
		}
	}
}
