package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DTO.Worker;

public class WorkerService implements WorkerServiceInterface {

	@Override
	public List<Worker> insert(Scanner scanner) {
		List<Worker> workers = new ArrayList<>();
		System.out.println("Nhap so luong cong nhan: ");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			Worker wk = new Worker();
			System.out.println("nhap cong nhan thu: " + (i + 1));
			wk.nhap(scanner);
			workers.add(wk);
		}
		return workers;

	}

	@Override
	public void Show(List<Worker> workers) {
		workers.forEach(Worker::xuat);
	}

	@Override
	public void Delete(List<Worker> workers, Scanner scanner) {
		scanner.nextLine();
		System.out.println("nhap id can xoa: ");
		String name = scanner.nextLine();
		Worker wk = workers.stream().filter(worker1 -> worker1.getID().equals(name)).findFirst().orElse(null);

		if (wk == null) {
			System.out.println("ko tim thay id");
			return;
		}
		workers.remove(wk);
		System.out.println("xoa xong");
	}
}
