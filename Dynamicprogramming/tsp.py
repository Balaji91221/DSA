# Define the distances between cities
distances = {
    ('A', 'B'): 10,
    ('A', 'C'): 15,
    ('A', 'D'): 20,
    ('B', 'C'): 35,
    ('B', 'D'): 25,
    ('C', 'D'): 30,
}

# Function to solve the TSP using dynamic programming
def tsp_dp(cities, start):
    n = len(cities)
    memo = [[None] * n for _ in range(2**n)]
    
    def tsp_dp_helper(mask, curr):
        if mask == (2**n - 1):
            return distances[curr, start]
        
        if memo[mask][curr] is not None:
            return memo[mask][curr]
        
        min_dist = float('inf')
        for i in range(n):
            if (mask >> i) & 1 == 0:
                next_mask = mask | (1 << i)
                dist = distances[curr, cities[i]] + tsp_dp_helper(next_mask, cities[i])
                min_dist = min(min_dist, dist)
        
        memo[mask][curr] = min_dist
        return min_dist
    
    return tsp_dp_helper(1, start)

# Example usage
cities = ['A', 'B', 'C', 'D']
start_city = 'A'
shortest_tour_distance = tsp_dp(cities, start_city)
print(f"The shortest tour distance starting from {start_city}: {shortest_tour_distance}")