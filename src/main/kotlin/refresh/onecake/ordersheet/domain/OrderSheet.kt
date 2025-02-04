package refresh.onecake.ordersheet.domain

import refresh.onecake.member.domain.BaseTimeEntity
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class OrderSheet (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = -1L,

    val questionId:Long, // question Id와 동일

    var orderId:Long,

    var answer:String

) : BaseTimeEntity()