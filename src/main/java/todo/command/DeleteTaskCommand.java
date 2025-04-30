package todo.command;

import todo.service.Task;
import todo.service.TaskManager;

import java.util.List;

public class DeleteTaskCommand implements Command {
    private Task task;
    private TaskManager taskManager;

    /**
     * 삭제 커맨드 생성자
     * @param taskManager
     */

    public DeleteTaskCommand(TaskManager taskManager, int index) {
        this.taskManager = taskManager;

        // 할 일 목록을 List 형태로 얻어오기
        List<Task> tasks = taskManager.getTaskAsList();

        // index 가 정상 범위긴 경우
        if (index >= 0 && index < tasks.size()) {
            this.task = tasks.get(index);
        } else {
            throw new IndexOutOfBoundsException("유효하지 않은 할 일 번호입니다");
        }
    }

    @Override
    public void execute() {
        taskManager.removeTask(task);
    }

    @Override
    public void undo() {
        taskManager.addTask(task);
    }


}
