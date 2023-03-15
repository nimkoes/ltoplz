package me.nimkoes.ltoplz;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import javax.transaction.Transactional;

@Transactional
@SpringBootTest
@ActiveProfiles("local")
class LtoplzApplicationTests {

}
