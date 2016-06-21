<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>学生信息</title>

    <!-- Bootstrap core CSS -->
    <!--  <link href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">-->
    <link href="./bootstrap/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="./css/dashboard.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="../../assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">学生管理系统</a>
          <a href="admin.jsp" class="btn btn-default btn-lg active" role="button">返回主界面</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="#"></a></li>
            <li><a href="#"></a></li>
            <li><a href="#"></a></li>
            <li><a href="#">Exit</a></li>
          </ul>
          
        </div>
      </div>
    </nav>

    <div class="container-fluid">
      <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
          <ul class="nav nav-sidebar">
            <s:url var="userinfo" action="userinfo.action">
              <s:param name="cardnumber" value="#session.user.sid"/>
            </s:url>
            <li><s:a href="%{userinfo}">学生概况</s:a></li>
          </ul>
          <ul class="nav nav-sidebar">
            <s:url var="showcardinfo" action="showcardinfo.action">
              <s:param name="sid" value="#session.user.sid"/>
            </s:url>
            <li><s:a href="%{showcardinfo}">一卡通信息</s:a></li>
            <!--  <li><a href=""></a></li>-->
          </ul>
          <ul class="nav nav-sidebar">
           <s:url var="showcreditinfo" action="showcreditinfo.action">
              <s:param name="sid" value="#session.user.sid"/>
            </s:url>
            <li><s:a href="%{showcreditinfo}">学分管理</s:a></li>
          </ul>
          <ul class="nav nav-sidebar">
            <s:url var="showcostinfo" action="showcostinfo.action">
              <s:param name="ncredit" value="#session.user.ncredit"/>
            </s:url>
            <li><s:a href="%{showcostinfo}">学费信息</s:a></li>
          </ul>
          <ul class="nav nav-sidebar">
            <s:url var="updatestudent" action="updatestudent.action">
              <s:param name="sid" value="#session.user.sid"/>
            </s:url>
            <li><s:a href="%{updatestudent}">编辑</s:a></li>
          </ul>
        </div>
        <s:if test="flag=='searchstudentsuccess'">
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header"><s:property value='user.name'/>同学</h1>

          <div class="row placeholders">
            <div class="col-xs-6 col-sm-3 placeholder">
              <img data-src="holder.js/200x200/auto/sky" class="img-responsive" alt="平均绩点">
              <h4></h4>
              <span class="text-muted">3</span>
            </div>
            <div class="col-xs-6 col-sm-3 placeholder">
              <img data-src="holder.js/200x200/auto/vine" class="img-responsive" alt="职位">
              <h4></h4>
              <span class="text-muted">学生</span>
            </div>
            <div class="col-xs-6 col-sm-3 placeholder">
              <img data-src="holder.js/200x200/auto/sky" class="img-responsive" alt="班级">
              <h4></h4>
              <span class="text-muted">13052314</span>
            </div>
            <div class="col-xs-6 col-sm-3 placeholder">
              <img data-src="holder.js/200x200/auto/vine" class="img-responsive" alt="入学年份">
              <h4></h4>
              <span class="text-muted">2013</span>
            </div>
          </div>

          <h2 class="sub-header">详细信息</h2>
          <div class="table-responsive">
            <table class="table table-striped">
              <tbody>
			    <tr class="active">
			      <td class="text-success">姓名</td>
			      <td class="text-success"><s:property value="#session.user.name"/></td>
			    </tr>
			    <tr class="active">
			      <td class="text-success">学号</td>
			      <td class="text-success"><s:property value="#session.user.sid"/></td>
			    </tr>
			    <tr class="active">
			      <td class="text-success">班级</td>
			      <td class="text-success"><s:property value="#session.user.cid"/></td>
			    </tr>
			    <tr class="active">
			      <td class="text-success">性别</td>
			      <td class="text-success"><s:property value="#session.user.sex"/></td>
			    </tr>
			    <tr class="active">
			      <td class="text-success">学院</td>
			      <td class="text-success"><s:property value="#session.user.college"/></td>
			    </tr>
			    <tr class="active">
			      <td class="text-success">宿舍</td>
			      <td class="text-success"><s:property value="#session.user.dorm"/></td>
			    </tr>
			    <tr class="active">
			      <td class="text-success">床铺</td>
			      <td class="text-success"><s:property value="#session.user.bedid"/></td>
			    </tr>
			    <tr class="active">
			      <td class="text-success">已选学分</td>
			      <td class="text-success"><s:property value="#session.user.ncredit"/></td>
			    </tr>
              </tbody>
            </table>
          </div>
        </div>
        </s:if>
        <s:if test="flag=='showcardinfo'">
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
         <h2 class="sub-header">消费记录</h2>
          <div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>时间</th>
                  <th>消费情况</th>
                  <th>是否挂失</th>
                  <th>剩余</th>
                  <th>学号</th>
                </tr>
              </thead>
              <tbody>
               <s:iterator value="cardlist" id="card">
			    <tr class="active">
			      <td class="text-success"><s:property value="#card.addDate"/></td>
				  <td class="text-success"><s:property value="#card.infor"/></td>
				  <td class="text-success"><s:property value="#card.isLost"/></td>
				  <td class="text-success"><s:property value="#card.remain"/></td>
			      <td class="text-success"><s:property value="#card.sid"/></td>
			    </tr>
			   </s:iterator>
              </tbody>
            </table>
          </div>
        </div>  
        </s:if>
        <s:if test="flag=='showcreditinfo'">
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
         <h2 class="sub-header">学分信息</h2>
          <div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>本学期所选学分</th>
                  <th>总学分</th>
                </tr>
              </thead>
              <tbody>
			    <tr class="active">
			      <td class="text-success"><s:property value="#session.user.ncredit"/></td>
				  <td class="text-success"><s:property value="#session.user.tcredit"/></td>
			    </tr>
              </tbody>
            </table>
          </div>
        </div>
        </s:if>
        <s:if test="flag=='showcostinfo'">
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
         <h2 class="sub-header">费用</h2>
          <div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>

                </tr>
              </thead>
              <tbody>
			    <tr class="active">
			      <td><s:property value="#session.user.name"/>同学本学期选了<s:property value="#session.user.ncredit"/>学分，需缴纳<s:property value="cost"/>元学费</td>
			     
			    </tr>
              </tbody>
            </table>
            <form action = "handinfee.action" method = "post">
			      <s:checkbox name="checkMe" fieldValue="true" label="本学期学费是否缴纳？"/>
			      <button type="submit" class="btn btn-default">Submit</button>
			      <s:hidden name="sid" value="%{#session.user.sid}"></s:hidden>
			</form>
          </div>
        </div>
        </s:if>
        <s:if test="flag=='showupdateform'">
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
         <h2 class="sub-header">编辑学生信息</h2>
          <div class="table-responsive">
            <form action="updatestudent.action" method="post">
	             <div class="form-group">
				    <div class="input-group">
					  <span class="input-group-addon" id="basic-addon1">姓名</span>
					  <input type="text" class="form-control" placeholder="name" name = "student.name" aria-describedby="basic-addon1">
					  <s:property value='#session.user.name'/>
					</div>
					<div class="input-group">
					  <span class="input-group-addon" id="basic-addon1">性别</span>
					  <input type="text" class="form-control" placeholder="sex" name = "student.sex" aria-describedby="basic-addon1">
					  <s:property value='#session.user.sex'/>
					</div>
					<div class="input-group">
					  <span class="input-group-addon" id="basic-addon1">学号</span>
					  <input type="text" class="form-control" placeholder="student id" name = "student.sid" aria-describedby="basic-addon1">
					  <s:property value='#session.user.sid'/>
					</div>
					<div class="input-group">
					  <span class="input-group-addon" id="basic-addon1">班级</span>
					  <input type="text" class="form-control" placeholder="class" name = "student.cid" aria-describedby="basic-addon1">
					  <s:property value='#session.user.cid'/>
					</div>
					<div class="input-group">
					  <span class="input-group-addon" id="basic-addon1">学院</span>
					  <input type="text" class="form-control" placeholder="college" name = "student.college" aria-describedby="basic-addon1">
					  <s:property value='#session.user.college'/>
					</div>
					<div class="input-group">
					  <span class="input-group-addon" id="basic-addon1">宿舍</span>
					  <input type="text" class="form-control" placeholder="dorm" name = "student.dorm" aria-describedby="basic-addon1">
					  <s:property value='#session.user.dorm'/>
					</div>
					<div class="input-group">
					  <span class="input-group-addon" id="basic-addon1">床铺</span>
					  <input type="text" class="form-control" placeholder="bed" name = "student.bedid" aria-describedby="basic-addon1">
					  <s:property value='#session.user.bedid'/>
					</div>
					<div class="input-group">
					  <span class="input-group-addon" id="basic-addon1">学分</span>
					  <input type="text" class="form-control" placeholder="credit" name = "student.ncredit" aria-describedby="basic-addon1">
					  <s:property value='#session.user.ncredit'/>
					</div>
					<s:hidden name="student.id" value="%{#session.user.id}"></s:hidden>
					</br>
					<button type="submit" class="btn btn-primary btn-lg btn-block active">完成</button>
				 </div>
		    </form>
          </div>
        </div>
        </s:if>
      </div>
    </div>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <script src="./jquery/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="./bootstrap/bootstrap.min.js"></script>
    <!-- Placed at the end of the document so the pages load faster -->
    <!--<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
    <script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>-->
    <!-- Just to make our placeholder images work. Don't actually copy the next line! -->
    <script src="../../assets/js/vendor/holder.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
