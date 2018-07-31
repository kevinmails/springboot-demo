package com.imcbb.bean.jedis;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.redis.core.RedisHash;

import java.time.LocalDateTime;

/**
 * @author kevin
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@RedisHash("Order")
public class Order {
    public String id;
    public String name;
    public String owner;
    public LocalDateTime orderTime;
}
