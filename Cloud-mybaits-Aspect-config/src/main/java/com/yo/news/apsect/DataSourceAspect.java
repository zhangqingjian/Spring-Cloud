/**
 * 
 */
package com.yo.news.apsect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
*/
/**
 * @author JAN
 * @CreatedTime：2017年7月13日 下午1:42:29 说明：
 */
@Aspect
@Component
public class DataSourceAspect
{

	/**
	 * 使用空方法定义切点表达式
	 */
	@Pointcut("execution(* com.yo.news..*.business..*.*(..))")
	public void declareJointPointExpression()
	{
	}

	@Before("declareJointPointExpression()")
	public void setDataSourceKey(JoinPoint point)
	{
		System.out.println(point.getTarget().getClass());
//		// 根据连接点所属的类实例，动态切换数据源
//		if (point.getTarget() instanceof Test1Service || point.getTarget() instanceof Test1ServiceImpl)
//		{
//			DatabaseContextHolder.setDatabaseType(DatabaseType.test1);
//		}
//		else
//		{// 连接点所属的类实例是（当然，这一步也可以不写，因为defaultTargertDataSource就是该类所用的mytestdb）
//			DatabaseContextHolder.setDatabaseType(DatabaseType.test2);
//		}
	}
}