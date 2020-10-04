# Python program to find the element that appears odd number of times 
# O(log n) approach 

# Binary search based function 
# Returns the element that appears odd number of times 
def search(arr, low, high): 
	
	# Base case 
	if low > high: 
		return None
	if low == high: 
		return arr[low] 

	# Find the middle point 
	mid = int((low + high)/2 )

	# If mid is even 
	if mid%2 == 0: 
		
		# If the element next to mid is same as mid, 
		# then output element lies on right side, 
		# else on left side 
		if arr[mid] == arr[mid+1]: 
			return search(arr, mid+2, high) 
		else: 
			return search(arr, low, mid) 

	else: 
		# else if mid is odd 

		if arr[mid] == arr[mid-1]: 
			return search(arr, mid+1, high) 
		else: 
			# (mid-1) because target element can only exist at even place 
			return search(arr, low, mid-1) 
n = int(input())
arr = list(map(int,input().split())) 
result = search(arr, 0, len(arr)-1 ) 
print(result)