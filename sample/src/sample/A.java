package sample;

public class A {
	public static void main(String[] args) {
		int a[] = { 4,2,1,3 };
		for (int x = 0; x < a.length; x++) {
			System.out.print(a[x]);
		}
		System.out.println();
		for (int j = 0; j < a.length; j++) {

			for (int k = 0; k < a.length; k++) {

				if (a[k] > a[j]) {

					int temp = a[k];
					a[k] = a[j];
					a[j] = temp;
					for (int x = 0; x < a.length; x++) {
						System.out.print(a[x]);
					}
					System.out.println();
					

				}
			}
		}
	}
	}
