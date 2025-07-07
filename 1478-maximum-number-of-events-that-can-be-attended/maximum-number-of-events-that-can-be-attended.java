class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0])); // Sort by start day

        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min-heap of endDays
        int i = 0, day = 0, n = events.length, count = 0;

        while (i < n || !pq.isEmpty()) {
            if (pq.isEmpty()) {
                day = events[i][0]; // jump to the next available event day
            }

            // Add all events starting on 'day'
            while (i < n && events[i][0] <= day) {
                pq.add(events[i][1]); // push endDay
                i++;
            }

            // Remove all events that already ended before 'day'
            while (!pq.isEmpty() && pq.peek() < day) {
                pq.poll();
            }

            // Attend the event with the earliest endDay
            if (!pq.isEmpty()) {
                pq.poll();
                count++;
                day++; // move to the next day
            }
        }

        return count;
    }
}
