
int f(int x, int count) {
    if (x == 0){
        return count;
    }
    f(x/10, count + 1);
