package com.snmaddula.smartms.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = { "/features" })
public class FeatureController {

	@GetMapping(path = { "names" })
	public List<String> listAllFeatureNames() {
		return Collections.singletonList("Java 11 Features");
	}
}
