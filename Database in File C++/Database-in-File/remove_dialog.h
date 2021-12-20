#ifndef REMOVE_DIALOG_H
#define REMOVE_DIALOG_H

#include <QDialog>

#include "database.hpp"

namespace Ui {
class RemoveDialog;
}

class RemoveDialog : public QDialog
{
    Q_OBJECT

private:
    Database &database;

public:
    explicit RemoveDialog(Database &database, QWidget *parent = nullptr);
    ~RemoveDialog();

private slots:
    void on_buttonBox_accepted();

private:
    Ui::RemoveDialog *ui;
};

#endif // REMOVE_DIALOG_H
