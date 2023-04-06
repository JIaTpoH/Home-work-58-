import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class HomeWork58 {
  public static int BinarySearch(ArrayList<Integer> num, int target) {
    int left = 0;
    int right = num.toArray().length -1;
    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (num.get(mid) == target) {
        return mid;
      } else if (num.get(mid) < target) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Введите количество элементов: ");
    int n = Integer.parseInt(br.readLine());

    ArrayList<Integer> numbers = new ArrayList<>(n);
    for (int i = 0; i < n; ++i) {
      numbers.add(Integer.parseInt(br.readLine()));
    }

    System.out.print("Введите число для поиска: ");
    int target = Integer.parseInt(br.readLine());

    System.out.println("Результат: " + BinarySearch(numbers, target));
  }
}