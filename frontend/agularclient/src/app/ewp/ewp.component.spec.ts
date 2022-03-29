import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EwpComponent } from './ewp.component';

describe('EwpComponent', () => {
  let component: EwpComponent;
  let fixture: ComponentFixture<EwpComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EwpComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EwpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
