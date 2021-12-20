#ifndef SELECT_DIALOG_H
#define SELECT_DIALOG_H

#include <QDialog>

namespace Ui {
class SelectDialog;
}

class SelectDialog : public QDialog
{
    Q_OBJECT

public:
    explicit SelectDialog(QWidget *parent = nullptr);
    QString id;
    ~SelectDialog();

private slots:
    void on_buttonBox_accepted();

private:
    Ui::SelectDialog *ui;
};

#endif // SELECT_DIALOG_H
