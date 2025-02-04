package refresh.onecake.address.domain

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AddressRepository : JpaRepository<Address, Long>{
    fun findAllBySggNm(sggNm: String): List<Address>?

}