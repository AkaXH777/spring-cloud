package cn.tedu.sp09.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import cn.tedu.sp01.pojo.Item;
import cn.tedu.web.util.JsonResult;

@FeignClient("item-service")
public interface ItemFeignService {
	@GetMapping("/{orderId}")
	JsonResult<List<Item>> getItems(@PathVariable String orderId);
	
	@PostMapping("/decreaseNumber")
	JsonResult decreaseNumber(@PathVariable List<Item> items);

}
