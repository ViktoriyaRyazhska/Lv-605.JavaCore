package forthone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tenInteg {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int[] tennumb = new int[10];
		
		int sum = 0;
		int product = 1;
		for (int i = 0; i < tennumb.length; i++) {
			System.out.println("Enter");
			tennumb[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 0; i < tennumb.length; i++) {
				if (tennumb[i] > 0 && i < 5); {
				sum = tennumb[0] + tennumb[1] + tennumb[2] + tennumb[3] + tennumb[4]; {
					System.out.println("Sum: " + sum);
				}
			}
		}
		
		for (int i = 0; i < tennumb.length; i++) {
				if (tennumb[i] < 0 && i > 4); {
					product = tennumb[5] * tennumb[6] * tennumb[7] * tennumb[8] * tennumb[9]; {
						System.out.println("Product: " + product);
					}
				}
			}
		}
}