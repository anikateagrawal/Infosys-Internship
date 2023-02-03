# Courses Order (Medium)
Mohan has just learnt about Infosys Springboard from his teachers. He is very excited to take courses from there. But he must attend college too so he has very little time, therefore, he can take at most one course at a time. After starting any course, he stops only after completing it. He wants to complete many courses as soon as possible so if there are options, he chooses the one he can finish the fastest. He made a list of several courses with their starting date and durations.  Help Mohan to find an order in which he can take all the courses without wasting his time.

### Input Format
First line containing an integer N representing number of courses. Next N lines contain 2 space separated integers start date and end date of course.

### Constraints
1<=N<=10^4

### Output Format
single line of space separated integers representing the order.

### Input: 
courses = \[[1,2], [2,4], [3,2], [4,1]]
### Output: 
[0,2,3,1]

#### Explanation:
Course 0 starts first at day 1 he takes 2 days to complete.
At day 3 he has course 1 and course 2 available so he chooses course 3 as it is of lesser duration and takes 2 days to complete it.
At day 5 he can take course 1 or 3. He chooses course 3 and then at last course 1.

### Input: 
courses = \[[ 7,10], [7,12], [7,5], [7,4], [7,2]]
### Output: 
[4,3,2,0,1]

