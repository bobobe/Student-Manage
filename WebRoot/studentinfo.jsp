<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge"><!--Bootstrap 不支持 IE 古老的兼容模式。为了让 IE 浏览器运行最新的渲染模式下-->
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"><!--移动设备支持,禁止缩放-->
    <title>学生信息</title>

    <!-- Bootstrap -->
    <link href="./bootstrap/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                
                
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <img alt="Brand" src="...">
            <a class="navbar-brand" href="#">学生管理系统</a>
        </div>
    </div><!-- /.container-fluid -->
</nav>

<div class="container-fluid">
    <div class="row">
    
      <div class="col-md-3">
      </div>
    
      <div class="col-md-6">
		
		<div class="panel panel-info">
		
		  <div class="panel-heading">学生信息</div>
	      
		  <div class="panel-body">
		  <s:if test="flag=='searchstudentsuccess'">
		    <form action="updatestudent.action" method="post">
	             <div class="form-group">
				    <div class="input-group">
					  <span class="input-group-addon" id="basic-addon1">姓名</span>
					  <input type="text" class="form-control" placeholder="name" name = "student.name" aria-describedby="basic-addon1">
					  <s:property value='user.name'/>
					</div>
					<div class="input-group">
					  <span class="input-group-addon" id="basic-addon1">性别</span>
					  <input type="text" class="form-control" placeholder="sex" name = "student.sex" aria-describedby="basic-addon1">
					  <s:property value='user.sex'/>
					</div>
					<div class="input-group">
					  <span class="input-group-addon" id="basic-addon1">学号</span>
					  <input type="text" class="form-control" placeholder="student id" name = "student.sid" aria-describedby="basic-addon1">
					  <s:property value='user.sid'/>
					</div>
					<div class="input-group">
					  <span class="input-group-addon" id="basic-addon1">班级</span>
					  <input type="text" class="form-control" placeholder="class" name = "student.cid" aria-describedby="basic-addon1">
					  <s:property value='user.cid'/>
					</div>
					<div class="input-group">
					  <span class="input-group-addon" id="basic-addon1">学院</span>
					  <input type="text" class="form-control" placeholder="college" name = "student.college" aria-describedby="basic-addon1">
					  <s:property value='user.college'/>
					</div>
					<div class="input-group">
					  <span class="input-group-addon" id="basic-addon1">宿舍</span>
					  <input type="text" class="form-control" placeholder="dorm" name = "student.dorm" aria-describedby="basic-addon1">
					  <s:property value='user.dorm'/>
					</div>
					<div class="input-group">
					  <span class="input-group-addon" id="basic-addon1">床铺</span>
					  <input type="text" class="form-control" placeholder="bed" name = "student.bedid" aria-describedby="basic-addon1">
					  <s:property value='user.bedid'/>
					</div>
					<div class="input-group">
					  <span class="input-group-addon" id="basic-addon1">学分</span>
					  <input type="text" class="form-control" placeholder="credit" name = "student.ncredit" aria-describedby="basic-addon1">
					  <s:property value='user.ncredit'/>
					</div>
					<s:hidden name="student.id" value="%{user.id}"></s:hidden>
					</br>
					<button type="submit" class="btn btn-primary btn-lg btn-block active">完成</button>
				 </div>
		    </form>
		   </s:if>
		</div>
		
	  </div>
	  
	  <div class="col-md-3">
      </div>
	  
	</div>
</div>


<script src="./jquery/jquery-1.11.3.min.js"></script>
<!--<script src="./jquery/my-jquery.js"></script>-->
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<!--<script src="http://localhost/projects/blog2.0/view/jquery/jquery.min.js"></script>-->
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="./bootstrap/bootstrap.min.js"></script>


</body>

</html>