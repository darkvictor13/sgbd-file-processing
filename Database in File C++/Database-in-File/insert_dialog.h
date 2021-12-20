#ifndef INSERT_DIALOG_H
#define INSERT_DIALOG_H

#include <QDialog>

#include "student.hpp"
#include "database.hpp"

namespace Ui {
class InsertDialog;
}

class InsertDialog : public QDialog
{
    Q_OBJECT
private:
    Database &database;
    Student student;
    int id;

public:
    explicit InsertDialog(Database &database, Student student, QWidget *parent = nullptr, int id = -1);
    ~InsertDialog();

private slots:
    void on_buttonBox_accepted();

private:
    Ui::InsertDialog *ui;
};

#endif // INSERT_DIALOG_H
