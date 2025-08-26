/*public class EASY2 {
    Map<Integer, Integer> count = new HashMap<>();
        for (int card : deck) {
        count.put(card, count.getOrDefault(card, 0) + 1);
    }

    // Step 2: Find GCD of all frequencies
    int gcd = 0;
        for (int freq : count.values()) {
        gcd = findGCD(gcd, freq);
    }

    // Step 3: If gcd >= 2, possible
        return gcd >= 2;
}

private int findGCD(int a, int b) {
    if (b == 0) return a;
    return findGCD(b, a % b);
}
}
}
 */