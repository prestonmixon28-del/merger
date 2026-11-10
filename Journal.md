# Journal
priorityqueue knows which company is smallest because the company class uses comparable to compare company sizes. If we wnated the largest companies first, we could reverse the compoarisons order

its more efficient because it keeps the smallest company ready to remove without sorting the whole list every time. Adding an item takes O(log n) time, while sorting a whole list takes O(n log n)

if i would forget to check the queue size before removing two companies. poll() could return null. This could cause an error when trying to use that company. This is similar to underflow becuase there are not enough items in the queue to remove

tested my program with different sizes. larger companies reached the titan theresold faster, while smaller companies needed more mergers. I checked that the program stopped correctly and counted the mergers. also reviewed my code for errors and made sure the priorityqueue wored as expected