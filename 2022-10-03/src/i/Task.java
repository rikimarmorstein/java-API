package i;

import java.time.LocalDateTime;
import java.util.Objects;

public class Task implements Comparable<Task> {

	private int id;
	private String description;
	public boolean done = false;
	private LocalDateTime deadline;
	private boolean alertPopped;

	public Task(int id, String description, LocalDateTime deadline) {
		super();
		this.id = id;
		this.description = description;
		this.deadline = deadline;
	}

	public boolean isDone() {
		done = true;
		return done;
	}

	public boolean isAlertPopped() {
		return alertPopped;
	}

	@Override
	public int hashCode() {
		return Objects.hash(alertPopped, deadline, description, done, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		return alertPopped == other.alertPopped && Objects.equals(deadline, other.deadline)
				&& Objects.equals(description, other.description) && done == other.done && id == other.id;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", description - " + description + ", done - " + done + ", deadline  - "
				+ Program.beautifyDate(deadline) + ", alertPopped - " + alertPopped + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDateTime deadline) {
		this.deadline = deadline;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public void setAlertPopped(boolean alertPopped) {
		this.alertPopped = alertPopped;
	}

	@Override
	public int compareTo(Task o) {
		return this.id - o.id;
	}
}
