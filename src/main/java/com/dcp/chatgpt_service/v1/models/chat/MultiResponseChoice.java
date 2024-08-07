package com.dcp.chatgpt_service.v1.models.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MultiResponseChoice {
	private MultiChatMessage message;

	@JsonProperty("finish_reason")
	private String finishReason;

	private Integer index;
}
