<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quiz01</title>
</head>
<body>
<%! 
	//필드
	private int sum = 0;
	//메소드
	public int getSum(int n) {
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
%>

<% 
int[] scores = {80, 90, 100, 95, 80};
int sum = 0;
for (int i = 0; i <= scores.length; i++) {
	sum += i;
}
double average = (double)sum / scores.length;
%>
<%= average %>

</body>
</html>