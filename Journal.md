# Journal
priorityqueue knows which company is smallest because the company class uses comparable to compare company sizes. If we wnated the largest companies first, we could reverse the compoarisons order

its more efficient because it keeps the smallest company ready to remove without sorting the whole list every time. Adding an item takes O(log n) time, while sorting a whole list takes O(n log n)