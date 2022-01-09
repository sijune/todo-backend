package com.sijune.todobackend.dto;

import com.sijune.todobackend.model.TodoEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TodoDTO {
    private String id;
    private String title;
    private boolean done;

    public TodoDTO(final TodoEntity entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.done = entity.isDone();
    }

    //save를 위한 메서드
    public static TodoEntity toEntity(final TodoDTO dto) {
        return TodoEntity.builder().id(dto.getId()).title(dto.getTitle()).done(dto.isDone()).build();
    }
}
