#include "main_window.h"
#include "ui_main_window.h"

MainWindow::MainWindow(QWidget *parent)
    : QMainWindow(parent),
      database(),
      ui(new Ui::MainWindow)
{
    ui->setupUi(this);
}

MainWindow::~MainWindow()
{
    delete ui;
}

void MainWindow::on_actionInserir_triggered()
{
    Student student;
    student.first_name = "";
    student.last_name = "";
    student .document_type = "";
    student.document_type = "";
    student.phone = "";
    student.email = "";
    student.city = "";
    InsertDialog *inserDialog = new InsertDialog(database, student, this);
    inserDialog->exec();
    delete inserDialog;
}

void MainWindow::on_actionAlterar_triggered()
{
    Student student;
    SelectDialog *selectDialog = new SelectDialog();
    selectDialog->exec();
    int id = selectDialog->id.toInt();
    if (id != 0) {
        student = database.data.at(id);
        InsertDialog *inserDialog = new InsertDialog(database, student, this, id);
        inserDialog->exec();
        delete inserDialog;
    }
    delete  selectDialog;
}

void MainWindow::on_actionRemover_triggered()
{
    RemoveDialog *removeDialog = new RemoveDialog(database, this);
    removeDialog->exec();
    delete removeDialog;
}

void MainWindow::on_actionListar_triggered()
{
    const std::vector<Student> dataList = database.getDataList();
    const size_t size = dataList.size();

    Student student;

    ui->tableWidget->setRowCount(size);

    for (size_t i = 0; i < size; i++) {
        student = dataList.at(i);
        ui->tableWidget->setItem(i, 0, new QTableWidgetItem(std::to_string(student.my_id).c_str()));
        ui->tableWidget->setItem(i, 1, new QTableWidgetItem(student.registration_date.c_str()));
        ui->tableWidget->setItem(i, 2, new QTableWidgetItem(student.first_name.c_str()));
        ui->tableWidget->setItem(i, 3, new QTableWidgetItem(student.last_name.c_str()));
        ui->tableWidget->setItem(i, 4, new QTableWidgetItem(student.document_type.c_str()));
        ui->tableWidget->setItem(i, 5, new QTableWidgetItem(student.document.c_str()));
        ui->tableWidget->setItem(i, 6, new QTableWidgetItem(student.phone.c_str()));
        ui->tableWidget->setItem(i, 7, new QTableWidgetItem(student.email.c_str()));
        ui->tableWidget->setItem(i, 8, new QTableWidgetItem(student.city.c_str()));
    }

    ui->tableWidget->update();
}


void MainWindow::on_actionSair_triggered()
{
    database.write();
    exit(0);
}

