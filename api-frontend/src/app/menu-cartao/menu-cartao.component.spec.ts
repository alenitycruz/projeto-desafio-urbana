import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MenuCartaoComponent } from './menu-cartao.component';

describe('MenuCartaoComponent', () => {
  let component: MenuCartaoComponent;
  let fixture: ComponentFixture<MenuCartaoComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [MenuCartaoComponent]
    });
    fixture = TestBed.createComponent(MenuCartaoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
