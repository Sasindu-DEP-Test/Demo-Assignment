void main() {

    int x = 5;
    boolean flag = true;

    while (flag ? x-- > 0: x++ < 4) {
        int y = 0;
        while (y++ < x) {
            System.out.print("* ");
        }
        System.out.println();

        if (x == 0) {
            flag = false;
            x++;
        }
    }
}