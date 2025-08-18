char* largestGoodInteger(char* num) {
    char* best = (char*)malloc(4 * sizeof(char));
    best[0] = '\0';
    int n = strlen(num);
    for (int i = 0; i + 2 < n; i++) {
        if (num[i] == num[i+1] && num[i] == num[i+2]) {
            char cur[4] = { num[i], num[i], num[i], '\0' };
            if (strlen(best) == 0 || strcmp(cur, best) > 0) {
                strcpy(best, cur);
            }
        }
    }
    return best;
}
