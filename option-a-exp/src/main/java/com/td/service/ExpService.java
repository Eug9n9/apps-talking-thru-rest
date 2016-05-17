package com.td.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.td.data.Bag;

@Component
public class ExpService {

	private Map<String, Bag> data = new HashMap<String, Bag>();

	public Bag getData(String refId) {
		return data.get(refId);
	}

	public Bag createData() {
		String refId = String.valueOf((new Date()).getTime());
		Bag bag = new Bag();
		bag.setRefId(refId);
		this.data.put(refId, bag);
		return bag;
	}

	public Bag updateData(Bag bag) {
		Bag original = data.get(bag.getRefId());
		if (original != null) {
			if (bag.getAmount() != null) {
				original.setAmount(bag.getAmount());
			}
			if (bag.getName() != null) {
				original.setName(bag.getName());
			}
		}
		return original;
	}
}
