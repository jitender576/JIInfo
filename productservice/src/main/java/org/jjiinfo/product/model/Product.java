package org.jjiinfo.product.model;

import org.springframework.lang.NonNull;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Getter
public class Product {
	@NonNull
	private String name;
}
