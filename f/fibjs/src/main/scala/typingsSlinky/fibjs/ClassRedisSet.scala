package typingsSlinky.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief Redis 数据库客户端 Set 对象，此对象为包含指定 key 的客户端，只有调用其方法才会操作数据库
  * @detail 用以操作 Redis 的 Set 对象，创建方法：,```JavaScript,var db = require("db");,var rdb = new db.openRedis("redis-server");,var set = rdb.getSet("test");,```
  */
@js.native
trait ClassRedisSet extends ClassObject {
  
  /**
    * 
    * @brief 同时将多个 field-value (域-值)对设置到哈希表中，此命令会覆盖哈希表中已存在的域
    * @param members 指定要添加的元素列表
    * @return 被添加到集合中的新元素的数量，不包括被忽略的元素
    * 
    * 
    */
  def add(members: js.Any*): Double = js.native
  /**
    * 
    * @brief 将一个或多个 member 元素加入到集合 key 当中，已经存在于集合的 member 元素将被忽略
    * @param members 指定要添加的元素数组
    * @return 被添加到集合中的新元素的数量，不包括被忽略的元素
    * 
    * 
    */
  def add(members: js.Array[_]): Double = js.native
  
  /**
    * 
    * @brief 判断 member 元素是否集合的成员
    * @param member 指定检查的 member
    * @return 如果 member 元素是集合的成员，返回 true
    * 
    * 
    */
  def exists(member: ClassBuffer): Boolean = js.native
  
  /**
    * 
    * @brief 返回集合中元素的数量
    * @return 返回集合的长度
    * 
    * 
    */
  def len(): Double = js.native
  
  /**
    * 
    * @brief 返回集合中的所有成员
    * @return 集合中所有成员的列表
    * 
    * 
    */
  def members(): js.Array[_] = js.native
  
  /**
    * 
    * @brief 移除并返回集合中的一个随机元素
    * @return 被移除的随机元素。当集合是空集时，返回 null
    * 
    * 
    */
  def pop(): ClassBuffer = js.native
  
  /**
    * 
    * @brief 从集合中获取随机的一个元素
    * @return 返回一个元素；如果集合为空，返回 null
    * 
    * 
    */
  def randMember(): js.Any = js.native
  /**
    * 
    * @brief 从集合中获取随机的若干元素
    * @param count 指定返回的元素个数。正数，返回一个包含 count 个元素的数组；负数，返回一个数组，数组中的元素可能会重复出现多次，而数组的长度为 count 的绝对值
    * @return 返回一个列表；如果集合为空，返回空列表
    * 
    * 
    */
  def randMember(count: Double): js.Any = js.native
  
  /**
    * 
    * @brief 移除集合中的一个或多个 member 元素
    * @param members 指定要移除的元素列表
    * @return 被成功移除的元素的数量，不包括被忽略的元素
    * 
    * 
    */
  def remove(members: js.Any*): Double = js.native
  /**
    * 
    * @brief 移除集合中的一个或多个 member 元素
    * @param members 指定要移除的元素数组
    * @return 被成功移除的元素的数量，不包括被忽略的元素
    * 
    * 
    */
  def remove(members: js.Array[_]): Double = js.native
}
