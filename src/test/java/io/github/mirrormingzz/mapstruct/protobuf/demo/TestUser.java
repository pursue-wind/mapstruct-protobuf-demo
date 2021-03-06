package io.github.mirrormingzz.mapstruct.protobuf.demo;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import io.github.mirrormingzz.mapstruct.protobuf.demo.domain.UserProtos;
import io.github.mirrormingzz.mapstruct.protobuf.demo.domain.user.Department;
import io.github.mirrormingzz.mapstruct.protobuf.demo.domain.user.MultiNumber;
import io.github.mirrormingzz.mapstruct.protobuf.demo.domain.user.Status;
import io.github.mirrormingzz.mapstruct.protobuf.demo.domain.user.User;
import io.github.mirrormingzz.mapstruct.protobuf.demo.mapstruct.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TestUser {

    @Test
    public void test() throws InvalidProtocolBufferException {
        User user = generateUser();

        UserProtos.UserDTO dto = UserMapper.INSTANCE.map(user);
        UserProtos.UserDTO deserialized = UserProtos.UserDTO.parseFrom(dto.toByteArray());
        User back = UserMapper.INSTANCE.map(deserialized);
//        User_491 user_491 = TestGen490Mapper.INSTANCE.map491(deserialized);
//        System.out.println(user_491);
        assertUser(user, back);
    }

    @Test
    public void testNulls() throws InvalidProtocolBufferException {
        User user = new User();
        user.setEmail("test");

        UserProtos.UserDTO dto = UserMapper.INSTANCE.map(user);
        UserProtos.UserDTO deserialized = UserProtos.UserDTO.parseFrom(dto.toByteArray());
        User back = UserMapper.INSTANCE.map(deserialized);

        assertNull(back.getId());
        assertEquals("test", back.getEmail());
    }

    @Test
    public void testNulls2() throws InvalidProtocolBufferException {
        User user = new User();
        user.setEmail("test");

        UserProtos.UserDTO dto = UserMapper.INSTANCE.map(user);
        UserProtos.UserDTO deserialized = UserProtos.UserDTO.parseFrom(dto.toByteArray());
        User back = UserMapper.INSTANCE.map(deserialized);

        assertNull(back.getId());
        assertEquals("test", back.getEmail());
    }

    private User generateUser() {
        User user = new User();
        user.setId(null);
        user.setEmail("test");
        user.getMainDepartments().add(new Department("SALES"));
        user.getDepartments().add(new Department("AFTER_MARKET"));

        user.setV1(1.0);
        user.setV2(2);
        user.setV3(3);
        user.setV4(4);
        user.setV5(5);
        user.setV6(6);
        user.setV7(7);
        user.setV8(8);
        user.setV9(9);
        user.setV10(10);
        user.setV11(11);
        user.setV12(12);
        user.setV13(true);
        user.setV14("some string");
        user.setV15(ByteString.copyFromUtf8("byte string"));
        user.setV16(Status.STARTED);

        user.setRv1(Collections.singletonList(1.0));
        user.setRv2(Arrays.asList(2.0f));
        user.setRv3(Arrays.asList(3));
        user.setRv4(Arrays.asList(4L));
        user.setRv5(Arrays.asList(5));
        user.setRv6(Arrays.asList(6L));
        user.setRv7(Arrays.asList(7));
        user.setRv8(Arrays.asList(8L));
        user.setRv9(Arrays.asList(9));
        user.setRv10(Arrays.asList(10L));
        user.setRv11(Arrays.asList(11));
        user.setRv12(Arrays.asList(12L));
        user.setRv13(Arrays.asList(true));
        user.setRv14(Arrays.asList("some string"));
        user.setRv15(Arrays.asList(ByteString.copyFromUtf8("some byte string")));
        user.setRv16(Arrays.asList(Status.STARTED));

        MultiNumber mm = new MultiNumber();
        mm.setNumber(1);

        user.setMultiNumber(mm);
        user.setRepMultiNumbers(Arrays.asList(mm));

        return user;
    }

    private void assertUser(User orig, User back) {

        //assertMapEquals(orig.getV19(), back.getV19());

        assertEquals(orig.getId(), back.getId());
        assertEquals(orig.getEmail(), back.getEmail());

        assertEquals(orig.getMainDepartments().size(), back.getMainDepartments().size());
        assertEquals(orig.getMainDepartments().get(0).getName(), back.getMainDepartments().get(0).getName());

        assertEquals(orig.getDepartments().size(), back.getDepartments().size());
        assertEquals(orig.getDepartments().get(0).getName(), back.getDepartments().get(0).getName());

        assertEquals(orig.getV1(), back.getV1(), 0.1);
        assertEquals(orig.getV2(), back.getV2(), 0.1);
        assertEquals(orig.getV3(), back.getV3());
        assertEquals(orig.getV4(), back.getV4());
        assertEquals(orig.getV5(), back.getV5());
        assertEquals(orig.getV6(), back.getV6());
        assertEquals(orig.getV7(), back.getV7());
        assertEquals(orig.getV8(), back.getV8());
        assertEquals(orig.getV9(), back.getV9());
        assertEquals(orig.getV10(), back.getV10());
        assertEquals(orig.getV11(), back.getV11());
        assertEquals(orig.getV12(), back.getV12());

        assertEquals(orig.isV13(), back.isV13());

        assertEquals(orig.getV14(), back.getV14());
        assertEquals(orig.getV15(), back.getV15());
        assertEquals(orig.getV16(), back.getV16());
        assertEquals(orig.getV16(), back.getV16());

        assertEquals(orig.getRv1().size(), back.getRv1().size());
        assertEquals(orig.getRv1().get(0), back.getRv1().get(0), 0.1);

        assertEquals(orig.getRv2().size(), back.getRv2().size());
        assertEquals(orig.getRv2().get(0), back.getRv2().get(0), 0.1);

        assertEquals(orig.getRv3().size(), back.getRv3().size());
        assertEquals(orig.getRv3().get(0), back.getRv3().get(0));

        assertEquals(orig.getRv4().size(), back.getRv4().size());
        assertEquals(orig.getRv4().get(0), back.getRv4().get(0));

        assertEquals(orig.getRv5().size(), back.getRv5().size());
        assertEquals(orig.getRv5().get(0), back.getRv5().get(0));

        assertEquals(orig.getRv6().size(), back.getRv6().size());
        assertEquals(orig.getRv6().get(0), back.getRv6().get(0));

        assertEquals(orig.getRv7().size(), back.getRv7().size());
        assertEquals(orig.getRv7().get(0), back.getRv7().get(0));

        assertEquals(orig.getRv8().size(), back.getRv8().size());
        assertEquals(orig.getRv8().get(0), back.getRv8().get(0));

        assertEquals(orig.getRv9().size(), back.getRv9().size());
        assertEquals(orig.getRv9().get(0), back.getRv9().get(0));

        assertEquals(orig.getRv10().size(), back.getRv10().size());
        assertEquals(orig.getRv10().get(0), back.getRv10().get(0));

        assertEquals(orig.getRv11().size(), back.getRv11().size());
        assertEquals(orig.getRv11().get(0), back.getRv11().get(0));

        assertEquals(orig.getRv12().size(), back.getRv12().size());
        assertEquals(orig.getRv12().get(0), back.getRv12().get(0));

        assertEquals(orig.getRv13().size(), back.getRv13().size());
        assertEquals(orig.getRv13().get(0), back.getRv13().get(0));

        assertEquals(orig.getRv14().size(), back.getRv14().size());
        assertEquals(orig.getRv14().get(0), back.getRv14().get(0));

        assertEquals(orig.getRv15().size(), back.getRv15().size());
        assertEquals(orig.getRv15().get(0), back.getRv15().get(0));

        assertEquals(orig.getRv16().size(), back.getRv16().size());
        assertEquals(orig.getRv16().get(0), back.getRv16().get(0));
    }

    private void assertMapEquals(Map<String, String> orig, Map<String, String> back) {
        assertNotNull(orig);
        assertNotNull(back);

        assertEquals(orig.keySet(), back.keySet(), "Original keys: " + orig.keySet() + " does not match " + back.keySet());
        assertEquals(orig.values(), back.values(), "Original values: " + orig.values() + " does not match " + back.values());

    }
}
