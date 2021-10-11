package mma.mySocksCount.repository;


import mma.mySocksCount.entity.Socks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;


public interface SocksRepository extends JpaRepository<Socks, Long> {

    Socks findSocksByColorAndCottonPart (String color,Integer cotton);
    List<Socks> findSocksByColor(String color);
}
