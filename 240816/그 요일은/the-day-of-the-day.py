from datetime import datetime, timedelta

m1, d1, m2, d2 = tuple(map(int, input().split()))
d = input()

def count_day(m1, d1, m2, d2, target_weekday):
    start_date = datetime(2024, m1, d1)
    end_date = datetime(2024, m2, d2)
    
    count = 0
    current_date = start_date
    
    while current_date <= end_date:
        if current_date.weekday() == target_weekday:
            count += 1
        current_date += timedelta(days=1)
    
    return count

target_weekday = 0
ans = count_day(m1, d1, m2, d2, target_weekday)
print(ans)